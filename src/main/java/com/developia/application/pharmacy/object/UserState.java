package com.developia.application.pharmacy.object;

/**
 * Created by shnovruzov on 10/12/2018.
 */
public enum UserState {
    ACTIVE(0), BLOCKED(-1);

    private int state;

    UserState(int state) {
        this.state = state;
    }

    public int getUserState () {
        return state;
    }

    public static UserState convertFromState (int state) {
        for (UserState st : values()) {
            if (st.getUserState() == state)
                return st;
        }
        return null;
    }
}
