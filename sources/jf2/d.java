package jf2;

import androidx.recyclerview.widget.c3;
import ao2.j0;
import dl2.j;
import info.mqtt.android.service.room.MqMessageDatabase;
import ja.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import oa.i;

/* loaded from: classes4.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MqMessageDatabase f75879r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f75880s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f75881t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MqMessageDatabase mqMessageDatabase, String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f75879r = mqMessageDatabase;
        this.f75880s = str;
        this.f75881t = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f75879r, this.f75880s, this.f75881t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c t13 = this.f75879r.t();
        ((d0) t13.f75872a).b();
        i a13 = ((c3) t13.f75877f).a();
        a13.c1(1, this.f75880s);
        a13.c1(2, this.f75881t);
        try {
            ((d0) t13.f75872a).c();
            try {
                int G = a13.G();
                ((d0) t13.f75872a).r();
                return Boolean.valueOf(G == 1);
            } finally {
                ((d0) t13.f75872a).m();
            }
        } finally {
            ((c3) t13.f75877f).j(a13);
        }
    }
}
