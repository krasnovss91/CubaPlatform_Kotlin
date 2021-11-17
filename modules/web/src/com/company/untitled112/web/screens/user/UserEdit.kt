package com.company.untitled112.web.screens.user

import com.haulmont.cuba.gui.screen.*
import com.company.untitled112.entity.User

@UiController("untitled112_User.edit")
@UiDescriptor("user-edit.xml")
@EditedEntityContainer("userDc")
@LoadDataBeforeShow
class UserEdit : StandardEditor<User>()