package hello.core.member;

public interface MemberService {
    void join(Member memer);

    Member findMember(Long memberId);
}
