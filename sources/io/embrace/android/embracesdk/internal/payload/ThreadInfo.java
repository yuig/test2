package io.embrace.android.embracesdk.internal.payload;

import a.cb;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import ep.b;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/ThreadInfo;", "", "", "threadId", "Ljava/lang/Thread$State;", AnimatedTarget.PROPERTY_STATE, "", "name", "", "priority", "", "lines", "frameCount", "copy", "(JLjava/lang/Thread$State;Ljava/lang/String;ILjava/util/List;I)Lio/embrace/android/embracesdk/internal/payload/ThreadInfo;", "<init>", "(JLjava/lang/Thread$State;Ljava/lang/String;ILjava/util/List;I)V", "org/chromium/net/y", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class ThreadInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f73264a;

    /* renamed from: b, reason: collision with root package name */
    public final Thread.State f73265b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73266c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73267d;

    /* renamed from: e, reason: collision with root package name */
    public final List f73268e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73269f;

    public ThreadInfo(long j13, Thread.State state, @p(name = "n") String str, @p(name = "p") int i13, @p(name = "tt") List<String> list, @p(name = "fc") int i14) {
        this.f73264a = j13;
        this.f73265b = state;
        this.f73266c = str;
        this.f73267d = i13;
        this.f73268e = list;
        this.f73269f = i14;
    }

    @NotNull
    public final ThreadInfo copy(long threadId, Thread.State state, @p(name = "n") String name, @p(name = "p") int priority, @p(name = "tt") List<String> lines, @p(name = "fc") int frameCount) {
        return new ThreadInfo(threadId, state, name, priority, lines, frameCount);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadInfo)) {
            return false;
        }
        ThreadInfo threadInfo = (ThreadInfo) obj;
        return this.f73264a == threadInfo.f73264a && this.f73265b == threadInfo.f73265b && Intrinsics.d(this.f73266c, threadInfo.f73266c) && this.f73267d == threadInfo.f73267d && Intrinsics.d(this.f73268e, threadInfo.f73268e) && this.f73269f == threadInfo.f73269f;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f73264a) * 31;
        Thread.State state = this.f73265b;
        int hashCode2 = (hashCode + (state == null ? 0 : state.hashCode())) * 31;
        String str = this.f73266c;
        int b13 = b.b(this.f73267d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        List list = this.f73268e;
        return Integer.hashCode(this.f73269f) + ((b13 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ThreadInfo(threadId=");
        sb3.append(this.f73264a);
        sb3.append(", state=");
        sb3.append(this.f73265b);
        sb3.append(", name=");
        sb3.append(this.f73266c);
        sb3.append(", priority=");
        sb3.append(this.f73267d);
        sb3.append(", lines=");
        sb3.append(this.f73268e);
        sb3.append(", frameCount=");
        return cb.l(sb3, this.f73269f, ')');
    }
}
