package hn0;

import android.media.MediaCodec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f69608j = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f69609i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f69609i) {
            case 0:
                return MediaCodec.createDecoderByType("video/avc");
            default:
                return Unit.f80348a;
        }
    }
}
