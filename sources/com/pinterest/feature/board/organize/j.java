package com.pinterest.feature.board.organize;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import oq.c0;
import sf1.s;
import sf1.v0;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45286c;

    public /* synthetic */ j(int i13, View view, Object obj) {
        this.f45284a = i13;
        this.f45285b = view;
        this.f45286c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        int i13 = this.f45284a;
        Object obj = this.f45286c;
        View view2 = this.f45285b;
        switch (i13) {
            case 0:
                ImageView this_apply = (ImageView) view2;
                l this$0 = (l) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Integer valueOf = event != null ? Integer.valueOf(event.getActionMasked()) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    this_apply.getHandler().postDelayed(this$0.f45293t, 200L);
                }
                return false;
            default:
                s this$02 = (s) view2;
                v0 listener = (v0) obj;
                int i14 = s.P;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                if (this$02.I != null) {
                    this$02.n();
                    return true;
                }
                Intrinsics.f(event);
                c0 c0Var = (c0) listener;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                View.OnTouchListener onTouchListener = c0Var.O;
                return onTouchListener != null ? onTouchListener.onTouch(c0Var, event) : false;
        }
    }
}
