package vu1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.EventListener;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f126719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar) {
        super(0);
        this.f126719i = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EventListener.Factory eventListenerFactory = this.f126719i.f126720a.eventListenerFactory();
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
