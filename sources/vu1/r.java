package vu1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.EventListener;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f126703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(0);
        this.f126703i = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EventListener.Factory eventListenerFactory = this.f126703i.f126704a.eventListenerFactory();
        if (!(eventListenerFactory instanceof wu1.b)) {
            return eventListenerFactory;
        }
        List list = ((wu1.b) eventListenerFactory).f131150a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            arrayList.add(obj);
        }
        return new wu1.b(arrayList);
    }
}
