package la;

import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import yk2.g;
import yk2.o;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f82360a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f82361b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f82362c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f82363d;

    public e(String name, Map columns, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f82360a = name;
        this.f82361b = columns;
        this.f82362c = foreignKeys;
        this.f82363d = abstractSet;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(pa.c cVar, String tableName) {
        Map c13;
        o oVar;
        o oVar2;
        int i13;
        String str;
        int i14;
        int i15;
        Throwable th3;
        d dVar;
        pa.c database = cVar;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        StringBuilder sb3 = new StringBuilder("PRAGMA table_info(`");
        sb3.append(tableName);
        String str2 = "`)";
        sb3.append("`)");
        Cursor c14 = database.c(sb3.toString());
        try {
            String str3 = "name";
            if (c14.getColumnCount() <= 0) {
                c13 = z0.d();
                dl2.b.J(c14, null);
            } else {
                int columnIndex = c14.getColumnIndex("name");
                int columnIndex2 = c14.getColumnIndex("type");
                int columnIndex3 = c14.getColumnIndex("notnull");
                int columnIndex4 = c14.getColumnIndex("pk");
                int columnIndex5 = c14.getColumnIndex("dflt_value");
                g builder = new g();
                while (c14.moveToNext()) {
                    String name = c14.getString(columnIndex);
                    String type = c14.getString(columnIndex2);
                    boolean z13 = c14.getInt(columnIndex3) != 0;
                    int i16 = c14.getInt(columnIndex4);
                    String string = c14.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    builder.put(name, new a(i16, 2, name, type, string, z13));
                    columnIndex = columnIndex;
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                c13 = builder.c();
                dl2.b.J(c14, null);
            }
            c14 = database.c("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = c14.getColumnIndex("id");
                int columnIndex7 = c14.getColumnIndex("seq");
                int columnIndex8 = c14.getColumnIndex("table");
                int columnIndex9 = c14.getColumnIndex("on_delete");
                int columnIndex10 = c14.getColumnIndex("on_update");
                int columnIndex11 = c14.getColumnIndex("id");
                int columnIndex12 = c14.getColumnIndex("seq");
                int columnIndex13 = c14.getColumnIndex("from");
                int columnIndex14 = c14.getColumnIndex("to");
                yk2.b bVar = new yk2.b();
                while (c14.moveToNext()) {
                    String str4 = str3;
                    int i17 = c14.getInt(columnIndex11);
                    int i18 = columnIndex11;
                    int i19 = c14.getInt(columnIndex12);
                    int i23 = columnIndex12;
                    String string2 = c14.getString(columnIndex13);
                    int i24 = columnIndex13;
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(fromColumnIndex)");
                    String string3 = c14.getString(columnIndex14);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(toColumnIndex)");
                    bVar.add(new c(string2, i17, i19, string3));
                    c13 = c13;
                    str3 = str4;
                    columnIndex11 = i18;
                    columnIndex12 = i23;
                    columnIndex13 = i24;
                    columnIndex14 = columnIndex14;
                }
                Map map = c13;
                String str5 = str3;
                List w03 = CollectionsKt.w0(e0.a(bVar));
                c14.moveToPosition(-1);
                o oVar3 = new o();
                while (c14.moveToNext()) {
                    if (c14.getInt(columnIndex7) == 0) {
                        int i25 = c14.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : w03) {
                            List list = w03;
                            int i26 = columnIndex6;
                            if (((c) obj).f82352a == i25) {
                                arrayList3.add(obj);
                            }
                            w03 = list;
                            columnIndex6 = i26;
                        }
                        List list2 = w03;
                        int i27 = columnIndex6;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar2 = (c) it.next();
                            arrayList.add(cVar2.f82354c);
                            arrayList2.add(cVar2.f82355d);
                        }
                        String string4 = c14.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = c14.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = c14.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string6, "cursor.getString(onUpdateColumnIndex)");
                        oVar3.add(new b(string4, string5, string6, arrayList, arrayList2));
                        w03 = list2;
                        columnIndex6 = i27;
                    }
                }
                o a13 = g1.a(oVar3);
                dl2.b.J(c14, null);
                c14 = database.c("PRAGMA index_list(`" + tableName + "`)");
                String str6 = str5;
                try {
                    int columnIndex15 = c14.getColumnIndex(str6);
                    int columnIndex16 = c14.getColumnIndex("origin");
                    int columnIndex17 = c14.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        oVar = null;
                        dl2.b.J(c14, null);
                    } else {
                        o oVar4 = new o();
                        while (c14.moveToNext()) {
                            if (Intrinsics.d("c", c14.getString(columnIndex16))) {
                                String string7 = c14.getString(columnIndex15);
                                boolean z14 = c14.getInt(columnIndex17) == 1;
                                Intrinsics.checkNotNullExpressionValue(string7, str6);
                                c14 = database.c("PRAGMA index_xinfo(`" + string7 + str2);
                                try {
                                    int columnIndex18 = c14.getColumnIndex("seqno");
                                    int columnIndex19 = c14.getColumnIndex("cid");
                                    int columnIndex20 = c14.getColumnIndex(str6);
                                    int columnIndex21 = c14.getColumnIndex("desc");
                                    String str7 = str6;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        i13 = columnIndex15;
                                        str = str2;
                                        i14 = columnIndex16;
                                        i15 = columnIndex17;
                                        th3 = null;
                                        dl2.b.J(c14, null);
                                        dVar = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        i13 = columnIndex15;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (c14.moveToNext()) {
                                            if (c14.getInt(columnIndex19) >= 0) {
                                                int i28 = c14.getInt(columnIndex18);
                                                String str8 = str2;
                                                String columnName = c14.getString(columnIndex20);
                                                int i29 = columnIndex21;
                                                String str9 = c14.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i33 = columnIndex16;
                                                Integer valueOf = Integer.valueOf(i28);
                                                Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                                                treeMap.put(valueOf, columnName);
                                                treeMap2.put(Integer.valueOf(i28), str9);
                                                str2 = str8;
                                                columnIndex16 = i33;
                                                columnIndex21 = i29;
                                                columnIndex17 = columnIndex17;
                                            }
                                        }
                                        str = str2;
                                        i14 = columnIndex16;
                                        i15 = columnIndex17;
                                        Collection values = treeMap.values();
                                        Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                                        List F0 = CollectionsKt.F0(values);
                                        Collection values2 = treeMap2.values();
                                        Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                                        dVar = new d(string7, F0, CollectionsKt.F0(values2), z14);
                                        dl2.b.J(c14, null);
                                        th3 = null;
                                    }
                                    if (dVar == null) {
                                        dl2.b.J(c14, th3);
                                        oVar2 = null;
                                        break;
                                    }
                                    oVar4.add(dVar);
                                    database = cVar;
                                    str6 = str7;
                                    columnIndex15 = i13;
                                    str2 = str;
                                    columnIndex16 = i14;
                                    columnIndex17 = i15;
                                } finally {
                                }
                            }
                        }
                        oVar = g1.a(oVar4);
                        dl2.b.J(c14, null);
                    }
                    oVar2 = oVar;
                    return new e(tableName, map, a13, oVar2);
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        } finally {
            try {
                throw th4;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!Intrinsics.d(this.f82360a, eVar.f82360a) || !Intrinsics.d(this.f82361b, eVar.f82361b) || !Intrinsics.d(this.f82362c, eVar.f82362c)) {
            return false;
        }
        Set set2 = this.f82363d;
        if (set2 == null || (set = eVar.f82363d) == null) {
            return true;
        }
        return Intrinsics.d(set2, set);
    }

    public final int hashCode() {
        return this.f82362c.hashCode() + a.c.e(this.f82361b, this.f82360a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f82360a + "', columns=" + this.f82361b + ", foreignKeys=" + this.f82362c + ", indices=" + this.f82363d + '}';
    }
}
