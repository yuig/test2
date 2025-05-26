package ads_mobile_sdk;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mp1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ np1 f8325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp1(np1 np1Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f8325b = np1Var;
        this.f8326c = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        mp1 mp1Var = new mp1(this.f8325b, this.f8326c, cVar);
        mp1Var.f8324a = obj;
        return mp1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mp1) create((SQLiteDatabase) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f8324a;
        np1 np1Var = this.f8325b;
        String str = this.f8326c;
        String str2 = np1.f8911f;
        np1Var.getClass();
        ContentValues contentValues = new ContentValues();
        fp1 fp1Var = fp1.f5235a;
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        np1.a(this.f8325b, sQLiteDatabase);
        return Unit.f80348a;
    }
}
