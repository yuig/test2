package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.view.View;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final p f46277j = new p(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p f46278k = new p(1);

    /* renamed from: l, reason: collision with root package name */
    public static final p f46279l = new p(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46280i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13) {
        super(1);
        this.f46280i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f46280i) {
            case 0:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, rm1.q.CANCEL, null, null, null, null, false, 0, 1022);
            case 1:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                return Boolean.valueOf(((view instanceof IdeaPinInteractiveVideoView) || (view instanceof IdeaPinInteractiveImageView) || (view instanceof IdeaPinHandDrawingView)) ? false : true);
            default:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q((Throwable) obj, "BoardSticker image load failed", tb0.p.IDEA_PINS_CREATION);
                return Unit.f80348a;
        }
    }
}
