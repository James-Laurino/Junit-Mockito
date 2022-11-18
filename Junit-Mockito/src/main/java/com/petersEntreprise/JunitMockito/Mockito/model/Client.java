package com.petersEntreprise.JunitMockito.Mockito.model;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class Client
{

    public enum ClientType { REGULAR_USER, ADMIN_USER }
    private String username;
    private String password;
    private Boolean live;
    private ClientType clientType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return live == client.live && Objects.equals(username, client.username) && Objects.equals(password, client.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, live);
    }
}
