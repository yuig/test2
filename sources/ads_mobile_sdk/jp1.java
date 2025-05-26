package ads_mobile_sdk;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class jp1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6908a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ np1 f6910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1 f6911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp1(np1 np1Var, gp1 gp1Var, bl2.c cVar) {
        super(2, cVar);
        this.f6910c = np1Var;
        this.f6911d = gp1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        jp1 jp1Var = new jp1(this.f6910c, this.f6911d, cVar);
        jp1Var.f6909b = obj;
        return jp1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jp1) create((SQLiteDatabase) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6908a;
        if (i13 == 0) {
            ue.c.H(obj);
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f6909b;
            ContentValues contentValues = new ContentValues();
            gp1 gp1Var = this.f6911d;
            contentValues.put("timestamp", new Long(gp1Var.f5653a));
            contentValues.put("gws_query_id", gp1Var.f5654b);
            contentValues.put("url", gp1Var.f5655c);
            fp1 fp1Var = fp1.f5235a;
            contentValues.put("event_state", new Integer(1));
            sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
            xp1 xp1Var = this.f6910c.f8914c;
            this.f6908a = 1;
            xp1Var.getClass();
            if (xp1.a(xp1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
