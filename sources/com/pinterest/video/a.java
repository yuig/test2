package com.pinterest.video;

import ac2.s0;
import ac2.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n7.b;
import n7.c;
import nc2.i;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f52741a;

    public a(s0 s0Var) {
        this.f52741a = s0Var;
    }

    @Override // n7.c
    public final void I(b eventTime, androidx.media3.common.b format) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(format, "format");
    }

    @Override // n7.c
    public final void T(b eventTime, String decoderName) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        s0 s0Var = this.f52741a;
        s0Var.f2056d.f2076d++;
        s0Var.f2054b.getAudioDecoderCounter().onReleased();
        s0Var.getClass();
    }

    @Override // n7.c
    public final void a(b eventTime, String decoderName) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        s0 s0Var = this.f52741a;
        s0Var.f2056d.getClass();
        s0Var.f2056d.f2077e = null;
        s0Var.f2054b.getVideoDecoderCounter().onReleased();
    }

    @Override // n7.c
    public final void h(b eventTime, String decoderName) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        s0 s0Var = this.f52741a;
        z0 z0Var = s0Var.f2056d;
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        z0Var.f2077e = StringsKt.E(decoderName, "hevc", false) ? i.HEVC : StringsKt.E(decoderName, "avc", false) ? i.AVC : i.UNKNOWN;
        s0Var.f2054b.getVideoDecoderCounter().onCreated();
    }

    @Override // n7.c
    public final void u(b eventTime, String decoderName) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        s0 s0Var = this.f52741a;
        s0Var.f2056d.f2075c++;
        s0Var.f2054b.getAudioDecoderCounter().onCreated();
        int i13 = s0Var.f2056d.f2075c;
    }
}
