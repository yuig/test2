package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f31734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.recaptcha.internal.ICloseCallback");
        this.f31734a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.recaptcha.a
    public final boolean j(int i13, Parcel parcel) {
        if (i13 != 1) {
            return false;
        }
        lb.l0.l1((Status) r.a(parcel, Status.CREATOR), Boolean.valueOf(parcel.readInt() != 0), this.f31734a);
        return true;
    }
}
