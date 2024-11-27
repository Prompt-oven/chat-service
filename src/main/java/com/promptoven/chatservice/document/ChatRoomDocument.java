package com.promptoven.chatservice.document;

import com.promptoven.chatservice.global.common.entity.BaseEntity;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "chat")
@NoArgsConstructor
public class ChatRoomDocument extends BaseEntity {

    @Id
    private String id;
    private String chatRoomName;
    private String hostUserUuid;
    private String inviteUserUuid;

    @Builder
    public ChatRoomDocument(String id, String chatRoomName, String hostUserUuid, String inviteUserUuid) {
        this.id = id;
        this.chatRoomName = chatRoomName;
        this.hostUserUuid = hostUserUuid;
        this.inviteUserUuid = inviteUserUuid;
    }
}
