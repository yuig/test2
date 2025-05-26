package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s implements com.google.android.gms.common.api.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f30868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tb.l f30869b;

    public s(tb.l lVar, fh.h hVar) {
        this.f30869b = lVar;
        this.f30868a = hVar;
    }

    @Override // com.google.android.gms.common.api.j
    public final void a(Status status) {
        ((Map) this.f30869b.f116986b).remove(this.f30868a);
    }
}
