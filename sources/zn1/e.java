package zn1;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kl2.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pa.j;
import u5.x;

/* loaded from: classes2.dex */
public final class e extends s implements m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142301i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f142302j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i13) {
        super(4);
        this.f142301i = i13;
        this.f142302j = obj;
    }

    public final gm1.c b(int i13, int i14, int i15, CharSequence charSequence) {
        int i16 = this.f142301i;
        Object obj = this.f142302j;
        switch (i16) {
            case 0:
                return new xn1.i(((GestaltTextField) ((x) obj).f120537c).getId(), i13, i14, i15, String.valueOf(charSequence));
            default:
                return new xn1.b(((GestaltTextField) ((x) obj).f120537c).getId(), i13, String.valueOf(charSequence), i14, i15);
        }
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f142301i) {
            case 0:
                return b(((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), (CharSequence) obj);
            case 1:
                return b(((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), (CharSequence) obj);
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                oa.h hVar = (oa.h) this.f142302j;
                Intrinsics.f(sQLiteQuery);
                hVar.a(new j(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
