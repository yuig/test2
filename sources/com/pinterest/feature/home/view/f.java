package com.pinterest.feature.home.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import pk.a0;

/* loaded from: classes5.dex */
public final class f extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45863c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45864d;

    public f(int i13, int i14, int i15, int i16) {
        this.f45861a = i16;
        this.f45862b = i13;
        this.f45863c = i14;
        this.f45864d = i15;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        int i13 = this.f45861a;
        int i14 = this.f45863c;
        int i15 = this.f45862b;
        int i16 = this.f45864d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                int b13 = state.b();
                if (b13 > 0) {
                    parent.getClass();
                    int r13 = RecyclerView.r1(view);
                    if (r13 != 0) {
                        if (r13 != b13 - 1) {
                            outRect.set(0, 0, i14, 0);
                            break;
                        } else {
                            outRect.set(0, 0, i16, 0);
                            break;
                        }
                    } else {
                        outRect.set(i15, 0, i14, 0);
                        break;
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                parent.getClass();
                int r14 = RecyclerView.r1(view);
                outRect.left = i15;
                outRect.top = r14 != 0 ? i16 : 0;
                outRect.right = i14;
                outRect.bottom = i16;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                int b14 = state.b();
                if (b14 > 0) {
                    parent.getClass();
                    int r15 = RecyclerView.r1(view);
                    if (r15 != 0) {
                        if (r15 != b14 - 1) {
                            outRect.set(0, 0, i14, 0);
                            break;
                        } else {
                            outRect.set(0, 0, i16, 0);
                            break;
                        }
                    } else {
                        outRect.set(i15, 0, i14, 0);
                        break;
                    }
                }
                break;
            default:
                super.f(outRect, view, parent, state);
                parent.getClass();
                int r16 = RecyclerView.r1(view);
                if (r16 > i16) {
                    outRect.top = i15;
                }
                if (r16 >= i16) {
                    outRect.bottom = i14;
                    break;
                }
                break;
        }
    }

    public f(Resources resources) {
        this.f45861a = 1;
        Intrinsics.checkNotNullParameter(resources, "resources");
        int K = a0.K(16, resources);
        this.f45862b = K;
        this.f45863c = K;
        this.f45864d = resources.getDimensionPixelSize(r0.margin_half);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(int i13, int i14) {
        this(i13, i14, 0, 3);
        this.f45861a = 3;
    }
}
