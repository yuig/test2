package fd;

import ao2.j0;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f61771r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f61772s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f61772s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f61772s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f61771r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f61771r = 1;
            obj = this.f61772s.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        if (Intrinsics.d(obj2, "connection_ack")) {
            return Unit.f80348a;
        }
        if (Intrinsics.d(obj2, "connection_error")) {
            throw new ApolloNetworkException("Connection error:\n" + map, 2);
        }
        System.out.println((Object) a.a.i("unknown message while waiting for connection_ack: '", obj2));
        return Unit.f80348a;
    }
}
