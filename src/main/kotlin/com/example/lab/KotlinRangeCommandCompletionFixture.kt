package com.example.lab

private fun ticketCallee(v: Int) {}

// BUG-03 — Kotlin: command completion / range context after callee (regression anchor).
// BUG-04 — Same anchor as BUG-03; separate defect / steps (see QA report).
@Suppress("UNUSED_PARAMETER")
fun rangeCommandCompletion_okAfterCalleeClosingParen(seed: Int) {
    ticketCallee(v = 1)
}
