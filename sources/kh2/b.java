package kh2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79435i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1 f79436j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f79437k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o oVar, b1 b1Var, int i13) {
        super(0);
        this.f79435i = i13;
        this.f79437k = oVar;
        this.f79436j = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79435i;
        b1 b1Var = this.f79436j;
        o oVar = this.f79437k;
        switch (i13) {
            case 0:
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(((q) oVar).b());
                Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferen…ule.context\n            )");
                d1 d1Var = (d1) b1Var;
                return new uh2.a(defaultSharedPreferences, d1Var.f79455a, d1Var.a());
            case 1:
                return new wg2.a(((d1) b1Var).a(), new File(((q) oVar).b().getFilesDir(), "embrace_remote_config"));
            case 2:
                return new bi2.b(((q) oVar).a(), ((d1) b1Var).f79456b);
            case 3:
                return dh2.f.NATIVE.asFile(((q) oVar).b(), ((d1) b1Var).f79456b);
            default:
                q qVar = (q) oVar;
                Context b13 = qVar.b();
                d1 d1Var2 = (d1) b1Var;
                d1Var2.getClass();
                return new fi2.b(b13, (gi2.a) d1Var2.f79459e.a(d1Var2, d1.f79454h[0]), new aa0.f(qVar.b()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b1 b1Var, o oVar) {
        super(0);
        this.f79435i = 1;
        this.f79436j = b1Var;
        this.f79437k = oVar;
    }
}
