package wd0;

import android.util.Log;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tb0.g;
import tb0.h;
import vb0.i;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f129223j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f129224k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129225i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f129225i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f129225i) {
            case 0:
                Log.d(i.class.getSimpleName(), "Idea Pin Font table cleared successfully");
                break;
            default:
                Log.e(i.class.getSimpleName(), "Idea Pin Font table clear failed");
                HashSet hashSet = h.f117076w;
                g.f117075a.o("Error clearing Font Table", (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
