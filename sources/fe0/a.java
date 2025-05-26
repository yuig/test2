package fe0;

import android.app.DownloadManager;
import android.database.Cursor;
import ja.d0;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import oa.i;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f62037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f62038c;

    public /* synthetic */ a(Object obj, long j13, int i13) {
        this.f62036a = i13;
        this.f62038c = obj;
        this.f62037b = j13;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f62036a;
        long j13 = this.f62037b;
        Object obj = this.f62038c;
        switch (i13) {
            case 0:
                b this$0 = (b) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ce0.a aVar = this$0.f62039a;
                d0 d0Var = aVar.f27584a;
                d0Var.b();
                zd0.b bVar = aVar.f27590g;
                i a13 = bVar.a();
                a13.u1(1, j13);
                try {
                    d0Var.c();
                    try {
                        int G = a13.G();
                        d0Var.r();
                        bVar.j(a13);
                        return Integer.valueOf(G);
                    } finally {
                        d0Var.m();
                    }
                } catch (Throwable th3) {
                    bVar.j(a13);
                    throw th3;
                }
            default:
                DownloadManager manager = (DownloadManager) obj;
                Intrinsics.checkNotNullParameter(manager, "$manager");
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(j13);
                Cursor query2 = manager.query(query);
                query2.moveToFirst();
                int columnIndex = query2.getColumnIndex("bytes_so_far");
                int columnIndex2 = query2.getColumnIndex("total_size");
                if (columnIndex < 0 || columnIndex2 < 0) {
                    throw new Exception("Invalid columns for download.");
                }
                float f13 = (query2.getInt(columnIndex) / query2.getInt(columnIndex2)) * 100;
                query2.close();
                return Integer.valueOf(Math.max(33, (int) f13));
        }
    }
}
