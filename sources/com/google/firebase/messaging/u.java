package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f33815d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f33816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33817b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33818c;

    public u(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f33815d.matcher(str3).matches()) {
            throw new IllegalArgumentException(a.a.k("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f33816a = str3;
        this.f33817b = str;
        this.f33818c = a.a.D(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f33816a.equals(uVar.f33816a) && this.f33817b.equals(uVar.f33817b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33817b, this.f33816a});
    }
}
