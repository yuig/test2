package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.LegacyPlayerView;
import com.pinterest.api.model.fo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import so.jb;
import so.oa;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinCreationPlayerView;", "Landroidx/media3/ui/LegacyPlayerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class IdeaPinCreationPlayerView extends LegacyPlayerView implements af2.c {
    public boolean A;
    public final boolean B;
    public final boolean C;
    public fo D;
    public List E;
    public dc2.e F;
    public m60.b0 G;
    public lh0.s1 H;

    /* renamed from: v, reason: collision with root package name */
    public ye2.o f45989v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f45990w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f45991x;

    /* renamed from: y, reason: collision with root package name */
    public xj2.c f45992y;

    /* renamed from: z, reason: collision with root package name */
    public ic2.d f45993z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationPlayerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        K();
        this.A = true;
        this.B = true;
        this.C = true;
        z(4);
        A(false);
    }

    public final void K() {
        if (this.f45990w) {
            return;
        }
        this.f45990w = true;
        oa oaVar = ((jb) ((t) generatedComponent())).f113483a;
        this.F = (dc2.e) oaVar.f113675f1.get();
        this.G = com.pinterest.widget.configuration.k.t();
        this.H = (lh0.s1) oaVar.f113718h8.get();
    }

    public final void L(fo volumeMix, ArrayList videoClipList) {
        Intrinsics.checkNotNullParameter(volumeMix, "volumeMix");
        Intrinsics.checkNotNullParameter(videoClipList, "videoClipList");
        if (!Intrinsics.d(videoClipList, this.E)) {
            this.E = videoClipList;
            a7.v0 v0Var = this.f18946k;
            if (v0Var != null) {
                a7.i0[] i0VarArr = (a7.i0[]) videoClipList.toArray(new a7.i0[0]);
                ac2.m0.a(v0Var, (a7.i0[]) Arrays.copyOf(i0VarArr, i0VarArr.length));
            }
        }
        a7.v0 v0Var2 = this.f18946k;
        if (v0Var2 != null) {
            v0Var2.H(volumeMix.getVideo());
        }
        this.D = volumeMix;
    }

    public final void M(boolean z13) {
        a7.v0 v0Var = this.f18946k;
        if ((v0Var == null || v0Var.f()) && this.A) {
            a7.v0 v0Var2 = this.f18946k;
            if (v0Var2 != null) {
                v0Var2.pause();
            }
            this.f45991x = z13;
        }
    }

    public final boolean N() {
        boolean z13 = false;
        boolean z14 = isShown() && this.A;
        if (!this.C) {
            return z14;
        }
        if (z14 && !this.f45991x) {
            z13 = true;
        }
        return z13;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45989v == null) {
            this.f45989v = new ye2.o(this);
        }
        return this.f45989v;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45989v == null) {
            this.f45989v = new ye2.o(this);
        }
        return this.f45989v.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dc2.e eVar = this.F;
        if (eVar == null) {
            Intrinsics.r("pinterestPlayerFactory");
            throw null;
        }
        m7.l0 f13 = eVar.f();
        y(f13);
        f13.L0();
        f13.y0(f13.f86254b0, true);
        f13.O(this.B ? 2 : 0);
        ic2.d dVar = this.f45993z;
        if (dVar != null) {
            s sVar = new s(dVar, 0);
            s sVar2 = new s(dVar, 1);
            s sVar3 = new s(dVar, 2);
            m60.b0 b0Var = this.G;
            if (b0Var == null) {
                Intrinsics.r("commonBackgroundDetector");
                throw null;
            }
            this.f45992y = ac2.m0.c(f13, sVar, sVar2, sVar3, b0Var, 16L, 96);
            f13.f0(dVar);
        }
        List list = this.E;
        if (list != null) {
            a7.i0[] i0VarArr = (a7.i0[]) list.toArray(new a7.i0[0]);
            ac2.m0.a(f13, (a7.i0[]) Arrays.copyOf(i0VarArr, i0VarArr.length));
            if (N()) {
                f13.play();
            }
        }
        fo foVar = this.D;
        if (foVar != null) {
            f13.H(foVar.getVideo());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a7.v0 v0Var = this.f18946k;
        if (v0Var != null) {
            v0Var.stop();
            xj2.c cVar = this.f45992y;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f45992y = null;
            ic2.d dVar = this.f45993z;
            if (dVar != null) {
                ((m7.l0) ((ExoPlayer) v0Var)).u0(dVar);
            }
            v0Var.a();
        }
        y(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i13) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i13);
        if (N()) {
            play();
        } else {
            M(false);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        super.onWindowFocusChanged(z13);
        if (z13 && N()) {
            play();
        } else {
            M(false);
        }
    }

    public final void play() {
        a7.v0 v0Var = this.f18946k;
        if ((v0Var == null || !v0Var.f()) && this.A) {
            a7.v0 v0Var2 = this.f18946k;
            if (v0Var2 != null) {
                v0Var2.play();
            }
            this.f45991x = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationPlayerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        K();
        this.A = true;
        this.B = true;
        this.C = true;
        z(4);
        A(false);
    }
}
