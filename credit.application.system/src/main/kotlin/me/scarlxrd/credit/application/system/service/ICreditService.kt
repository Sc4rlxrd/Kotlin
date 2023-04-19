package me.scarlxrd.credit.application.system.service

import me.scarlxrd.credit.application.system.entity.Credit
import java.util.UUID

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId: Long): List<Credit>
    //fun findAllByCreditCode(customerId: Long, creditCode: UUID): Credit
    //fun findAllByCreditCode(customerId: Long, creditCode: UUID): Credit
    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit


}