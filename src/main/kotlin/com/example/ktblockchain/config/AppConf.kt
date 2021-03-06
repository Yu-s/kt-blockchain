package com.example.ktblockchain.config

object AppConf {
  const val MINING_DIFFICULTY = 3
  const val MESSAGE_DIGEST_ALGO = "SHA-256"
  const val MINING_SENDER = "THE BLOCKCHAIN"
  const val MINING_REWARD = 10.0
  const val SIGNATURE_ALGO = "SHA256withECDSA"
  const val PORT = 8080
  const val BLOCKCHAIN_SERVER_URL = "http://192.168.20.2:8080"
  const val CREATE_TRANSACTION_PATH = "/transactions"
  const val CREATE_CONSENSUS_PATH = "/consensus"
  const val CHAIN_PATH = "/chain"
  const val GET_TOTAL_AMOUNT_PATH  = "/amount?blockChainAddress={blockChainAddress}"
  const val DEFAULT_HOST_NAME = "192.168.20.2"
  val BLOCKCHAIN_PORT_RANGE = 8080..8080
  val NEIGHBOURS_IP_RANGE = -1..1
  const val BLOCKCHAIN_NEIGHBOURS_SYNC_TIME_SEC = 20000
  const val BLOCKCHAIN_MINING_TIME_SEC = 20000
}