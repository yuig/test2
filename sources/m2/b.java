package m2;

import android.view.View;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import q5.m0;
import q5.v0;

/* loaded from: classes2.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Collection f85666j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, Collection collection) {
        super(1);
        this.f85665i = i13;
        this.f85666j = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collection = this.f85666j;
        int i13 = this.f85665i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            case 1:
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            default:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = v0.f102521a;
                return Boolean.valueOf(CollectionsKt.L(collection, m0.f(view)));
        }
    }
}
