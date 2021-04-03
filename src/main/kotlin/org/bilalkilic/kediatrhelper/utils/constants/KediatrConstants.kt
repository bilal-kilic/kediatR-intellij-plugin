package org.bilalkilic.kediatrhelper.utils.constants

object KediatrConstants {
    const val KediatrPackageName = "com.trendyol.kediatr"
    const val KediatrDependencyPrefix = "com.trendyol:kediatr"
    const val KediatrQueryHandlerStructureChangeVersion = "1.0.13"

    val KediatrCommandNames = arrayOf(
        "Command",
        "Query",
        "Notification"
    )

    val KediatrHandlerNames = arrayOf(
        "CommandHandler",
        "AsyncCommandHandler",
        "QueryHandler",
        "AsyncQueryHandler",
        "NotificationHandler",
        "AsyncNotificationHandler",
    )

    val KediatrHandlerMap = mapOf(
        "com.trendyol.kediatr.Command" to listOf("com.trendyol.kediatr.CommandHandler", "com.trendyol.kediatr.AsyncCommandHandler"),
        "com.trendyol.kediatr.Query" to listOf("com.trendyol.kediatr.QueryHandler", "com.trendyol.kediatr.AsyncQueryHandler"),
        "com.trendyol.kediatr.Notification" to listOf("com.trendyol.kediatr.NotificationHandler", "com.trendyol.kediatr.NotificationQueryHandler"),
    )
}
