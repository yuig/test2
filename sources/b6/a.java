package b6;

import androidx.datastore.core.CorruptionException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements a6.a {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f22010a;

    public a(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f22010a = produceNewData;
    }

    @Override // a6.a
    public final Object l(CorruptionException corruptionException) {
        return this.f22010a.invoke(corruptionException);
    }
}
