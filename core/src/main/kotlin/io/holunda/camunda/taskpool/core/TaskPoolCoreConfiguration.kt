package io.holunda.camunda.taskpool.core

import io.holunda.camunda.taskpool.core.business.DataEntryAggregate
import io.holunda.camunda.taskpool.core.task.TaskAggregate
import org.axonframework.eventsourcing.EventSourcingRepository
import org.axonframework.eventsourcing.eventstore.EventStore
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration


@Configuration
@ComponentScan
open class TaskPoolCoreConfiguration {

  @Bean
  open fun taskAggregateRepository(eventStore: EventStore): EventSourcingRepository<TaskAggregate> {
    return EventSourcingRepository(TaskAggregate::class.java, eventStore)
  }

  @Bean
  open fun dataEntryAggregateRepository(eventStore: EventStore): EventSourcingRepository<DataEntryAggregate> {
    return EventSourcingRepository(DataEntryAggregate::class.java, eventStore)
  }

}
