package com.example.lab

private fun ticketCallee(v: Int) {}

@Suppress("UNUSED_PARAMETER")
fun rangeCommandCompletion_okAfterCalleeClosingParen(seed: Int) {
    ticketCallee(v = 1)
}

@Suppress("UNUSED_PARAMETER")
fun rangeCommandCompletion_breaksNamedParameterName(seed: Int) {
    ticketCallee(v = 1)
}

@Suppress("UNUSED_PARAMETER")
fun rangeCommandCompletion_breaksNamedParameterValue(seed: Int) {
    ticketCallee(v = 1)
}
