package com.bignerdranch.android.geoquiz

import androidx.annotation.StringRes
import java.sql.RowId

data class Question(@StringRes val textResId: Int, val answer: Boolean)
