package dev.shushant.sun_and_storm_kmp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.seiko.imageloader.ImageLoader
import com.seiko.imageloader.LocalImageLoader
import com.seiko.imageloader.cache.memory.maxSizePercent
import com.seiko.imageloader.component.setupDefaultComponents
import com.seiko.imageloader.util.DebugLogger
import com.seiko.imageloader.util.LogPriority


@Composable
fun AppViewDesktop() {
    PlatformState.value = Platform.DESKTOP
    CompositionLocalProvider(
        LocalImageLoader provides ImageLoader {
            logger = DebugLogger(LogPriority.VERBOSE)
            components {
                setupDefaultComponents(imageScope)
            }
            interceptor {
                memoryCacheConfig {
                    maxSizePercent(0.25)
                }
            }
        },
    ) {
        SunAndStormApp(false)
    }
}