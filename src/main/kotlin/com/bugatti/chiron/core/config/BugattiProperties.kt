package com.bugatti.chiron.core.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("bugatti")
data class BugattiProperties(val engine: Engine)

data class Engine(val realtime: RealTime, val topicSubscription: TopicSubscription, val mass: Mass)

data class RealTime(
    var corePoolSize: Int,
    var maxPoolSize: Int,
    var queueCapacity: Int
)

data class TopicSubscription(
    var corePoolSize: Int,
    var maxPoolSize: Int,
    var queueCapacity: Int
)

data class Mass(
    var corePoolSize: Int,
    var maxPoolSize: Int,
    var queueCapacity: Int
)
