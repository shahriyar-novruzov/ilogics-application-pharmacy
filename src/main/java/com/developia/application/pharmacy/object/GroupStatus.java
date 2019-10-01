/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.developia.application.pharmacy.object;

/**
 * Created by shnovruzov on 10/02/2019.
 */

public enum GroupStatus {
    ACTIVE(0), SUSPENDED(1), FINISHED(2), CANCELLED(3);

    public final int STATUS;

    private GroupStatus(int code) {
        this.STATUS = code;
    }

    public static GroupStatus convertFromCode(int code) {
        for (GroupStatus s : GroupStatus.values())
            if (s.STATUS == code)
                return s;

        return null;
    }


}
