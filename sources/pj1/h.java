package pj1;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100297i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f100298j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(0);
        this.f100297i = i13;
        this.f100298j = iVar;
    }

    public final Drawable b() {
        int i13 = this.f100297i;
        i iVar = this.f100298j;
        switch (i13) {
            case 0:
                return iVar.f100300l.getDrawable(wy1.c.indicator_fullscreen_icon);
            case 1:
                return bs1.c.c0(iVar.f100300l, iVar.f100301m ? wy1.c.indicator_muted_icon_vr : wy1.c.indicator_muted_icon);
            default:
                return bs1.c.c0(iVar.f100300l, iVar.f100301m ? wy1.c.indicator_sound_icon_vr : wy1.c.indicator_sound_icon);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f100297i) {
        }
        return b();
    }
}
