package tv;

import ao2.j0;
import com.pinterest.api.model.pi0;
import dl2.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes3.dex */
public final class b extends j implements Function2 {
    public final /* synthetic */ e A;

    /* renamed from: r, reason: collision with root package name */
    public e f119482r;

    /* renamed from: s, reason: collision with root package name */
    public Collection f119483s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f119484t;

    /* renamed from: u, reason: collision with root package name */
    public pi0 f119485u;

    /* renamed from: v, reason: collision with root package name */
    public Collection f119486v;

    /* renamed from: w, reason: collision with root package name */
    public int f119487w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f119488x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f119489y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f119490z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, r rVar, e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f119489y = list;
        this.f119490z = rVar;
        this.A = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f119489y, this.f119490z, this.A, cVar);
        bVar.f119488x = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b6 -> B:5:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ba -> B:6:0x00bc). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
