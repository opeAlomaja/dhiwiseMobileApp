package com.opemiposapplication.app.modules.transactionsuccessfulthree.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TransactionSuccessfulThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionSuc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_suc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourtransactio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_transactio)

)