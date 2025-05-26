package uo2;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements EventListener.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EventListener f122926a;

    public /* synthetic */ a(EventListener eventListener) {
        this.f122926a = eventListener;
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener a(Call it) {
        byte[] bArr = Util.f95757a;
        EventListener this_asFactory = this.f122926a;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }
}
