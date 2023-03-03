package tn.esprit.leagueoflegendrecyclerview.data

import androidx.room.Entity
import androidx.room.PrimaryKey

const val PICTURE = "PICTURE"
const val NAME = "NAME"
const val ROLE = "ROLE"

//TODO 6 "Change this class to an Entity"
@Entity
data class Champion(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val champPic: Int,

    val champName: String,

    val champRole: String

)