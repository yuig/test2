package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f33424a;

    /* renamed from: b, reason: collision with root package name */
    private final y f33425b;

    public aq(String str, y yVar) {
        this.f33424a = str;
        this.f33425b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i13) {
        return this.f33425b.a(activity, i13);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f33424a;
    }
}
