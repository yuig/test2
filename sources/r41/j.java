package r41;

import android.content.Context;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.j3;
import df.j1;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.f0;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f106172j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f106173k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f106174l = new j(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106175i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(0);
        this.f106175i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f106175i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return new Pair((ScreenLocation) j3.f51014b.getValue(), e.Business);
                    default:
                        return new Pair((ScreenLocation) j3.f51014b.getValue(), e.Pinner);
                }
            case 1:
                Context context = kb0.a.f79058b;
                return (c) j1.b0(c.class, f0.W());
            default:
                switch (i13) {
                    case 0:
                        return new Pair((ScreenLocation) j3.f51014b.getValue(), e.Business);
                    default:
                        return new Pair((ScreenLocation) j3.f51014b.getValue(), e.Pinner);
                }
        }
    }
}
