package ey;

import android.content.Context;
import java.util.Random;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.Util;
import so.oa;

/* loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final f3 f60483j = new f3(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f3 f60484k = new f3(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60485i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(int i13) {
        super(0);
        this.f60485i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f60485i) {
            case 0:
                Context context = kb0.a.f79058b;
                return (mc.i) ((oa) ((e3) df.j1.b0(e3.class, m60.f0.W()))).f113752j7.get();
            default:
                if (ff0.j.f62103a) {
                    return new Random(System.currentTimeMillis());
                }
                String y13 = Util.y(System.currentTimeMillis());
                String a13 = vb0.b.f125448a.a();
                return new Random((y13 + a13).hashCode());
        }
    }
}
