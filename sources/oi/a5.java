package oi;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class a5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f94642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractSafeParcelable f94643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f94644d;

    public /* synthetic */ a5(w4 w4Var, AbstractSafeParcelable abstractSafeParcelable, Object obj, int i13) {
        this.f94641a = i13;
        this.f94642b = w4Var;
        this.f94643c = abstractSafeParcelable;
        this.f94644d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Collection collection;
        int i13 = this.f94641a;
        w4 w4Var = this.f94642b;
        switch (i13) {
            case 0:
                w4Var.f95246a.M();
                z5 z5Var = w4Var.f95246a.f94662h;
                a7.p(z5Var);
                z5Var.p();
                ((u4) z5Var.f24333a).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                w4Var.f95246a.M();
                zzo zzoVar = (zzo) this.f94643c;
                Bundle bundle = (Bundle) this.f94644d;
                a7 a7Var = w4Var.f95246a;
                a7Var.zzl().p();
                ia.a();
                if (!a7Var.G().x(zzoVar.f32044f, s.C0) || (str = zzoVar.f32044f) == null) {
                    return new ArrayList();
                }
                if (bundle != null) {
                    int[] intArray = bundle.getIntArray("uriSources");
                    long[] longArray = bundle.getLongArray("uriTimestamps");
                    if (intArray != null) {
                        if (longArray == null || longArray.length != intArray.length) {
                            a7Var.zzj().f95268f.c("Uri sources and timestamps do not match");
                        } else {
                            for (int i14 = 0; i14 < intArray.length; i14++) {
                                i iVar = a7Var.f94657c;
                                a7.p(iVar);
                                int i15 = intArray[i14];
                                long j13 = longArray[i14];
                                com.bumptech.glide.d.o(str);
                                iVar.p();
                                iVar.t();
                                try {
                                    int delete = iVar.w().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i15), String.valueOf(j13)});
                                    iVar.zzj().f95276n.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i15), Long.valueOf(j13));
                                } catch (SQLiteException e13) {
                                    iVar.zzj().f95268f.a(y3.v(str), e13, "Error pruning trigger URIs. appId");
                                }
                            }
                        }
                    }
                }
                i iVar2 = a7Var.f94657c;
                a7.p(iVar2);
                com.bumptech.glide.d.o(str);
                iVar2.p();
                iVar2.t();
                ArrayList arrayList = new ArrayList();
                Cursor cursor = null;
                try {
                    try {
                        cursor = iVar2.w().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                        if (cursor.moveToFirst()) {
                            do {
                                String string = cursor.getString(0);
                                if (string == null) {
                                    string = "";
                                }
                                arrayList.add(new zzmh(string, cursor.getLong(1), cursor.getInt(2)));
                            } while (cursor.moveToNext());
                            cursor.close();
                            collection = arrayList;
                        } else {
                            cursor.close();
                            collection = arrayList;
                        }
                    } catch (SQLiteException e14) {
                        iVar2.zzj().f95268f.a(y3.v(str), e14, "Error querying trigger uris. appId");
                        Collection emptyList = Collections.emptyList();
                        collection = emptyList;
                        if (cursor != null) {
                            cursor.close();
                            collection = emptyList;
                        }
                    }
                    return collection;
                } catch (Throwable th3) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th3;
                }
        }
    }
}
