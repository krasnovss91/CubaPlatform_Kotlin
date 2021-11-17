package com.company.untitled112.web.screens.user

import com.haulmont.cuba.gui.screen.*
import com.company.untitled112.entity.User

@UiController("untitled112_User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@LoadDataBeforeShow
class UserBrowse : StandardLookup<User>()