package com.study.portfolio.pfpart

import com.study.portfolio.pfpart.Projects

class ProjectHelper {
    private val projectList = mutableListOf<Projects>()

    fun getProductList(): List<Projects> {

        val p0 = Projects(
            1,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p1 = Projects(
            2,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p2 = Projects(
            3,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p3 = Projects(
            4,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p4 = Projects(
            5,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p5 = Projects(
            6,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p6 = Projects(
            7,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p7 = Projects(
            8,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p8 = Projects(
            9,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )
        val p9 = Projects(
            10,
            "ChargeX",
            "rental power bank for everyone!, enjoy event without caring of your phone battery..."
        )

        projectList.addAll(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9))

        return projectList
    }

}