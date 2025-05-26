package p4;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import i2.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.a2;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f98829i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f98830j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f98831k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r2.k f98832l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f98833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f98834n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, Function1 function1, i2.q qVar, r2.k kVar, int i13, View view) {
        super(0);
        this.f98829i = context;
        this.f98830j = function1;
        this.f98831k = qVar;
        this.f98832l = kVar;
        this.f98833m = i13;
        this.f98834n = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KeyEvent.Callback callback = this.f98834n;
        Intrinsics.g(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        r2.k kVar = this.f98832l;
        int i13 = this.f98833m;
        return new t(this.f98829i, this.f98830j, this.f98831k, kVar, i13, (a2) callback).f98815v;
    }
}
