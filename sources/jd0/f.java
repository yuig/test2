package jd0;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hd0.g f75490j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(hd0.g gVar, int i13) {
        super(0);
        this.f75489i = i13;
        this.f75490j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f75489i) {
            case 0:
                m163invoke();
                break;
            default:
                m163invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m163invoke() {
        int i13 = this.f75489i;
        hd0.g gVar = this.f75490j;
        switch (i13) {
            case 0:
                gVar.f68861i.invoke(new hd0.c(gVar));
                md0.a aVar = md0.a.NEWS_ITEM_COMPLETED_TAPPED;
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("placed_experience_id", gVar.f68855c);
                hashMap.put("carousel_index", String.valueOf(gVar.f68857e));
                aVar.setAuxData(hashMap);
                gVar.f68862j.invoke(aVar);
                break;
            default:
                gVar.f68861i.invoke(new hd0.d(gVar));
                md0.a aVar2 = md0.a.NEWS_ITEM_DISMISSED_TAPPED;
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put("placed_experience_id", gVar.f68855c);
                hashMap2.put("carousel_index", String.valueOf(gVar.f68857e));
                aVar2.setAuxData(hashMap2);
                gVar.f68862j.invoke(aVar2);
                break;
        }
    }
}
