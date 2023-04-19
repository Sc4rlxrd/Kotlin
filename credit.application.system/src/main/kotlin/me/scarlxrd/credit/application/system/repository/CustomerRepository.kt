package me.scarlxrd.credit.application.system.repository

import me.scarlxrd.credit.application.system.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Long> {
}