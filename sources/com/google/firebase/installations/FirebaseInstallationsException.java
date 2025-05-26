package com.google.firebase.installations;

import com.bumptech.glide.d;
import com.google.firebase.FirebaseException;

/* loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        d.p("Detail message must not be empty", str);
    }
}
