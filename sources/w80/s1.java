package w80;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.LegacyPlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128385i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f128386j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(ExoPlayer exoPlayer, int i13) {
        super(1);
        this.f128385i = i13;
        this.f128386j = exoPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f128385i;
        ExoPlayer exoPlayer = this.f128386j;
        switch (i13) {
            case 0:
                i2.t0 DisposableEffect = (i2.t0) obj;
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                return new e.b(exoPlayer, 8);
            case 1:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                LegacyPlayerView legacyPlayerView = new LegacyPlayerView(it, null);
                legacyPlayerView.y(exoPlayer);
                legacyPlayerView.z(4);
                return legacyPlayerView;
            default:
                LegacyPlayerView view = (LegacyPlayerView) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                view.y(exoPlayer);
                return Unit.f80348a;
        }
    }
}
