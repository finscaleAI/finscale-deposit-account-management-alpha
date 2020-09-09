package org.muellners.finscale.deposit.commands

import java.util.*
import org.axonframework.modelling.command.TargetAggregateIdentifier

data class DeleteProductInstanceCommand(
    @TargetAggregateIdentifier
    val id: UUID?
)
