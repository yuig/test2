package com.pinterest.gestalt.switchComponent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.firebase.messaging.q;
import fm1.a;
import fm1.c;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import on1.f;
import on1.u;
import on1.x;
import org.jetbrains.annotations.NotNull;
import u50.o;
import xm1.k;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\r\u0003\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/pinterest/gestalt/switchComponent/GestaltSwitch;", "Landroidx/appcompat/widget/ModifiedSwitchCompat;", "Lgm1/b;", "Lon1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "on1/c", "switchComponent_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltSwitch extends u implements b {
    public static final c L = c.VISIBLE;
    public static final on1.c M = on1.c.DEVICE_SETTING;
    public static final a N = a.AUTO;

    /* renamed from: J, reason: collision with root package name */
    public final q f49613J;
    public CompoundButton.OnCheckedChangeListener K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSwitch(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltSwitch i(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltSwitch) this.f49613J.d(nextState, new k(10, this, l()));
    }

    public final GestaltSwitch j(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltSwitch) this.f49613J.c(eventHandler, new on1.a(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4.f96708a == r5.f96708a) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(on1.b r4, on1.b r5) {
        /*
            r3 = this;
            on1.e r0 = on1.e.f96716j
            on1.a r1 = new on1.a
            r2 = 2
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            if (r4 == 0) goto L14
            boolean r0 = r5.f96708a
            boolean r1 = r4.f96708a
            if (r1 != r0) goto L14
            goto L3e
        L14:
            if (r4 == 0) goto L3e
            boolean r0 = r5.f96708a
            android.graphics.drawable.Drawable r0 = r3.f16398a
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            java.lang.String r1 = "getCurrent(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.graphics.drawable.Drawable r2 = r3.f16399b
            android.graphics.drawable.Drawable r2 = r2.getCurrent()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            boolean r1 = r2 instanceof android.graphics.drawable.AnimatedVectorDrawable
            if (r1 == 0) goto L35
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            r2.start()
        L35:
            boolean r1 = r0 instanceof android.graphics.drawable.AnimatedVectorDrawable
            if (r1 == 0) goto L3e
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
        L3e:
            boolean r0 = r5.f96708a
            r3.setChecked(r0)
            boolean r0 = r5.f96709b
            r3.setEnabled(r0)
            r3.m()
            on1.e r0 = on1.e.f96717k
            on1.a r1 = new on1.a
            r2 = 3
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            on1.e r0 = on1.e.f96718l
            on1.a r1 = new on1.a
            r2 = 4
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r5.f96711d
            if (r0 == r4) goto L6a
            r3.setId(r0)
        L6a:
            fm1.c r4 = r5.f96710c
            int r4 = r4.getVisibility()
            r3.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.switchComponent.GestaltSwitch.k(on1.b, on1.b):void");
    }

    public final on1.b l() {
        return (on1.b) ((o) this.f49613J.f33803a);
    }

    public final void m() {
        int i13 = 1;
        boolean z13 = !l().f96709b;
        final q qVar = this.f49613J;
        int i14 = 0;
        if (z13) {
            setClickable(false);
            qVar.getClass();
            Intrinsics.checkNotNullParameter(this, "switch");
            setOnCheckedChangeListener(null);
            return;
        }
        setClickable(true);
        final f doOnCheckedChange = new f(this, i14);
        final f makeOnCheckedChangeEvent = new f(this, i13);
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "switch");
        Intrinsics.checkNotNullParameter(doOnCheckedChange, "doOnCheckedChange");
        Intrinsics.checkNotNullParameter(makeOnCheckedChangeEvent, "makeOnCheckedChangeEvent");
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: im1.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                Function2 doOnCheckedChange2 = doOnCheckedChange;
                Intrinsics.checkNotNullParameter(doOnCheckedChange2, "$doOnCheckedChange");
                CompoundButton compoundButton2 = this;
                Intrinsics.checkNotNullParameter(compoundButton2, "$switch");
                q this$0 = qVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2 makeOnCheckedChangeEvent2 = makeOnCheckedChangeEvent;
                Intrinsics.checkNotNullParameter(makeOnCheckedChangeEvent2, "$makeOnCheckedChangeEvent");
                doOnCheckedChange2.invoke(compoundButton2, Boolean.valueOf(z14));
                this$0.s((gm1.c) makeOnCheckedChangeEvent2.invoke(compoundButton2, Boolean.valueOf(z14)));
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSwitch(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSwitch(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltSwitch = x.GestaltSwitch;
        Intrinsics.checkNotNullExpressionValue(GestaltSwitch, "GestaltSwitch");
        this.f49613J = new q(this, attributeSet, i13, GestaltSwitch, new on1.a(this, 0));
        if (this.f16406i) {
            this.f16406i = false;
            requestLayout();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f16413p = dl2.b.T1(context2);
        k(null, l());
    }
}
